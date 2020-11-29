package ml.classification.tests;

import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;

import ml.classification.dSL.ML;
import ml.classification.generator.Compiler2Python;
import ml.classification.generator.Compiler2R;
import ml.classification.generator.Interpreter;
import ml.classification.generator.PrettyPrinter;

import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;


@ExtendWith(InjectionExtension.class)
@InjectWith(DSLInjectorProvider.class)
public class Main {
	@Inject
	static ParseHelper<ML> parseHelper = new ParseHelper<ML>();

	public static void main(String[] args) throws Exception  {
		System.out.println("test");
		if (args.length >= 1) {
			String path = args[0];

			String content = Files.readString(Paths.get(path));
			System.out.println(content);
			ML input = parseHelper.parse(content);
			assert(input != null);

			PrettyPrinter pp = new PrettyPrinter();
			System.out.println("****************");
			System.out.println("* Pretty print *");
			System.out.println("****************");
			System.out.println(pp.prettyprint(input));
			System.out.println("\n\n\n\n\n");

			Interpreter interpreter = new Interpreter();
			System.out.println("***************");
			System.out.println("* Interpreter *");
			System.out.println("***************");
			interpreter.interpret(input);

			Compiler2Python compPy = new Compiler2Python();
			System.out.println("***********************");
			System.out.println("* Generatong .py file *");
			System.out.println("***********************");
			String py = compPy.compile(input);
			String fileNamePy = path.replaceAll(".mldsl", ".py");
			RandomAccessFile writer = new RandomAccessFile(fileNamePy, "w");
			writer.writeChars(py);
			writer.close();

			Compiler2R compR = new Compiler2R();
			System.out.println("**********************");
			System.out.println("* Generatong .r file *");
			System.out.println("**********************");
			String r = compR.compile(input);
			String fileNameR = path.replaceAll(".mldsl", ".r");
			RandomAccessFile writer2 = new RandomAccessFile(fileNameR, "w");
			writer2.writeChars(r);
			writer2.close();
		}
	}
}