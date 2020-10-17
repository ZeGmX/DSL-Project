/**
 * generated by Xtext 2.19.0
 */
package ml.classification.generator;

import com.google.common.collect.Iterables;
import ml.classification.dSL.ML;
import ml.classification.generator.Compiler2Python;
import ml.classification.generator.PrettyPrinter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your Statement files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<ML> _filter = Iterables.<ML>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), ML.class);
    for (final ML ml : _filter) {
      {
        String _replaceAll = resource.getURI().lastSegment().replaceAll(".mldsl", "");
        final String namePrettyPrint = (_replaceAll + "-prettyprinted.mldsl");
        final PrettyPrinter prettyPrinter = new PrettyPrinter();
        fsa.generateFile(namePrettyPrint, prettyPrinter.prettyprint(ml));
        String _replaceAll_1 = resource.getURI().lastSegment().replaceAll(".mldsl", "");
        final String nameCompilePython = (_replaceAll_1 + ".py");
        final Compiler2Python compiler2Python = new Compiler2Python();
        fsa.generateFile(nameCompilePython, compiler2Python.compile(ml));
      }
    }
  }
}
