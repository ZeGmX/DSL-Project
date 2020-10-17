package ml.classification.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLLexer extends Lexer {
    public static final int RULE_SEP=9;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=6;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ALGO_NAME=10;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_METRIC=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalDSLLexer() {;} 
    public InternalDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDSL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:11:7: ( '=' )
            // InternalDSL.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:12:7: ( 'predict' )
            // InternalDSL.g:12:9: 'predict'
            {
            match("predict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:13:7: ( 'use_metric' )
            // InternalDSL.g:13:9: 'use_metric'
            {
            match("use_metric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:14:7: ( 'use_column' )
            // InternalDSL.g:14:9: 'use_column'
            {
            match("use_column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:15:7: ( 'unuse_column' )
            // InternalDSL.g:15:9: 'unuse_column'
            {
            match("unuse_column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:16:7: ( 'predict_column' )
            // InternalDSL.g:16:9: 'predict_column'
            {
            match("predict_column"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:17:7: ( 'use_strategy' )
            // InternalDSL.g:17:9: 'use_strategy'
            {
            match("use_strategy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:18:7: ( 'train_test' )
            // InternalDSL.g:18:9: 'train_test'
            {
            match("train_test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:19:7: ( 'cross_valid' )
            // InternalDSL.g:19:9: 'cross_valid'
            {
            match("cross_valid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:20:7: ( 'read' )
            // InternalDSL.g:20:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:21:7: ( 'use_algorithm' )
            // InternalDSL.g:21:9: 'use_algorithm'
            {
            match("use_algorithm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:22:7: ( 'print' )
            // InternalDSL.g:22:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_METRIC"
    public final void mRULE_METRIC() throws RecognitionException {
        try {
            int _type = RULE_METRIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:898:13: ( ( 'accuracy' | 'recall' | 'f1' ) )
            // InternalDSL.g:898:15: ( 'accuracy' | 'recall' | 'f1' )
            {
            // InternalDSL.g:898:15: ( 'accuracy' | 'recall' | 'f1' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt1=1;
                }
                break;
            case 'r':
                {
                alt1=2;
                }
                break;
            case 'f':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDSL.g:898:16: 'accuracy'
                    {
                    match("accuracy"); 


                    }
                    break;
                case 2 :
                    // InternalDSL.g:898:27: 'recall'
                    {
                    match("recall"); 


                    }
                    break;
                case 3 :
                    // InternalDSL.g:898:36: 'f1'
                    {
                    match("f1"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_METRIC"

    // $ANTLR start "RULE_SEP"
    public final void mRULE_SEP() throws RecognitionException {
        try {
            int _type = RULE_SEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:900:10: ( ( ';' | ',' ) )
            // InternalDSL.g:900:12: ( ';' | ',' )
            {
            if ( input.LA(1)==','||input.LA(1)==';' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEP"

    // $ANTLR start "RULE_ALGO_NAME"
    public final void mRULE_ALGO_NAME() throws RecognitionException {
        try {
            int _type = RULE_ALGO_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:902:16: ( ( 'tree' | 'svm' ) )
            // InternalDSL.g:902:18: ( 'tree' | 'svm' )
            {
            // InternalDSL.g:902:18: ( 'tree' | 'svm' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='s') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:902:19: 'tree'
                    {
                    match("tree"); 


                    }
                    break;
                case 2 :
                    // InternalDSL.g:902:26: 'svm'
                    {
                    match("svm"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALGO_NAME"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:904:13: ( RULE_INT '.' RULE_INT )
            // InternalDSL.g:904:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:906:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDSL.g:906:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDSL.g:906:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:906:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDSL.g:906:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:908:10: ( ( '0' .. '9' )+ )
            // InternalDSL.g:908:12: ( '0' .. '9' )+
            {
            // InternalDSL.g:908:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:908:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:910:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDSL.g:910:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDSL.g:910:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSL.g:910:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDSL.g:910:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDSL.g:910:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDSL.g:910:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDSL.g:910:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDSL.g:910:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDSL.g:910:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDSL.g:910:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:912:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDSL.g:912:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDSL.g:912:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:912:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:914:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDSL.g:914:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDSL.g:914:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDSL.g:914:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalDSL.g:914:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:914:41: ( '\\r' )? '\\n'
                    {
                    // InternalDSL.g:914:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalDSL.g:914:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:916:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDSL.g:916:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDSL.g:916:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSL.g:918:16: ( . )
            // InternalDSL.g:918:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_METRIC | RULE_SEP | RULE_ALGO_NAME | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=23;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalDSL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalDSL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalDSL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalDSL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalDSL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalDSL.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalDSL.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalDSL.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalDSL.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalDSL.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalDSL.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalDSL.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalDSL.g:1:82: RULE_METRIC
                {
                mRULE_METRIC(); 

                }
                break;
            case 14 :
                // InternalDSL.g:1:94: RULE_SEP
                {
                mRULE_SEP(); 

                }
                break;
            case 15 :
                // InternalDSL.g:1:103: RULE_ALGO_NAME
                {
                mRULE_ALGO_NAME(); 

                }
                break;
            case 16 :
                // InternalDSL.g:1:118: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 17 :
                // InternalDSL.g:1:130: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // InternalDSL.g:1:138: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // InternalDSL.g:1:147: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalDSL.g:1:159: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalDSL.g:1:175: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalDSL.g:1:191: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalDSL.g:1:199: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\uffff\7\25\1\uffff\1\25\1\37\1\22\1\uffff\3\22\3\uffff\1\25\1\uffff\6\25\1\60\1\uffff\1\25\2\uffff\1\37\4\uffff\12\25\1\uffff\1\74\5\25\1\74\1\25\1\106\2\25\1\uffff\1\25\1\112\7\25\1\uffff\3\25\1\uffff\7\25\1\60\1\25\1\136\11\25\1\uffff\7\25\1\60\11\25\1\170\1\171\3\25\1\175\2\25\2\uffff\3\25\1\uffff\1\u0083\1\25\1\u0085\1\25\1\u0087\1\uffff\1\25\1\uffff\1\u0089\1\uffff\1\u008a\2\uffff";
    static final String DFA14_eofS =
        "\u008b\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\162\1\156\2\162\1\145\1\143\1\61\1\uffff\1\166\1\56\1\101\1\uffff\2\0\1\52\3\uffff\1\145\1\uffff\1\145\1\165\1\141\1\157\1\141\1\143\1\60\1\uffff\1\155\2\uffff\1\56\4\uffff\1\144\1\156\1\137\1\163\1\151\1\145\1\163\1\144\1\141\1\165\1\uffff\1\60\1\151\1\164\1\141\1\145\1\156\1\60\1\163\1\60\1\154\1\162\1\uffff\1\143\1\60\1\145\1\157\1\164\1\154\3\137\1\uffff\1\154\1\141\1\164\1\uffff\1\164\1\154\1\162\1\147\1\143\1\164\1\166\1\60\1\143\1\60\1\162\1\165\1\141\2\157\1\145\1\141\1\171\1\143\1\uffff\1\151\1\155\1\164\1\162\1\154\1\163\1\154\1\60\1\157\1\143\1\156\1\145\1\151\1\165\1\164\1\151\1\154\2\60\1\147\1\164\1\155\1\60\1\144\1\165\2\uffff\1\171\1\150\1\156\1\uffff\1\60\1\155\1\60\1\155\1\60\1\uffff\1\156\1\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\1\162\1\163\2\162\1\145\1\143\1\61\1\uffff\1\166\1\71\1\172\1\uffff\2\uffff\1\57\3\uffff\1\151\1\uffff\1\145\1\165\1\145\1\157\2\143\1\172\1\uffff\1\155\2\uffff\1\71\4\uffff\1\144\1\156\1\137\1\163\1\151\1\145\1\163\1\144\1\141\1\165\1\uffff\1\172\1\151\1\164\1\163\1\145\1\156\1\172\1\163\1\172\1\154\1\162\1\uffff\1\143\1\172\1\145\1\157\1\164\1\154\3\137\1\uffff\1\154\1\141\1\164\1\uffff\1\164\1\154\1\162\1\147\1\143\1\164\1\166\1\172\1\143\1\172\1\162\1\165\1\141\2\157\1\145\1\141\1\171\1\143\1\uffff\1\151\1\155\1\164\1\162\1\154\1\163\1\154\1\172\1\157\1\143\1\156\1\145\1\151\1\165\1\164\1\151\1\154\2\172\1\147\1\164\1\155\1\172\1\144\1\165\2\uffff\1\171\1\150\1\156\1\uffff\1\172\1\155\1\172\1\155\1\172\1\uffff\1\156\1\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\7\uffff\1\16\3\uffff\1\21\3\uffff\1\26\1\27\1\1\1\uffff\1\21\7\uffff\1\16\1\uffff\1\22\1\20\1\uffff\1\23\1\24\1\25\1\26\12\uffff\1\15\13\uffff\1\17\11\uffff\1\12\3\uffff\1\14\23\uffff\1\2\31\uffff\1\3\1\4\3\uffff\1\10\5\uffff\1\11\1\uffff\1\7\1\uffff\1\5\1\uffff\1\13\1\6";
    static final String DFA14_specialS =
        "\1\2\15\uffff\1\1\1\0\173\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\16\4\22\1\17\4\22\1\11\2\22\1\20\12\13\1\22\1\11\1\22\1\1\3\22\32\15\3\22\1\14\1\15\1\22\1\7\1\15\1\5\2\15\1\10\11\15\1\2\1\15\1\6\1\12\1\4\1\3\5\15\uff85\22",
            "",
            "\1\24",
            "\1\27\4\uffff\1\26",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "\1\36",
            "\1\40\1\uffff\12\41",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\0\42",
            "\0\42",
            "\1\43\4\uffff\1\44",
            "",
            "",
            "",
            "\1\46\3\uffff\1\47",
            "",
            "\1\50",
            "\1\51",
            "\1\52\3\uffff\1\53",
            "\1\54",
            "\1\55\1\uffff\1\56",
            "\1\57",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\61",
            "",
            "",
            "\1\40\1\uffff\12\41",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\75",
            "\1\76",
            "\1\102\1\uffff\1\100\11\uffff\1\77\5\uffff\1\101",
            "\1\103",
            "\1\104",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\105",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\134",
            "\12\25\7\uffff\32\25\4\uffff\1\135\1\uffff\32\25",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\176",
            "\1\177",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0084",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\u0086",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\u0088",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_METRIC | RULE_SEP | RULE_ALGO_NAME | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) ) {s = 34;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_14 = input.LA(1);

                        s = -1;
                        if ( ((LA14_14>='\u0000' && LA14_14<='\uFFFF')) ) {s = 34;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='=') ) {s = 1;}

                        else if ( (LA14_0=='p') ) {s = 2;}

                        else if ( (LA14_0=='u') ) {s = 3;}

                        else if ( (LA14_0=='t') ) {s = 4;}

                        else if ( (LA14_0=='c') ) {s = 5;}

                        else if ( (LA14_0=='r') ) {s = 6;}

                        else if ( (LA14_0=='a') ) {s = 7;}

                        else if ( (LA14_0=='f') ) {s = 8;}

                        else if ( (LA14_0==','||LA14_0==';') ) {s = 9;}

                        else if ( (LA14_0=='s') ) {s = 10;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 11;}

                        else if ( (LA14_0=='^') ) {s = 12;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||(LA14_0>='d' && LA14_0<='e')||(LA14_0>='g' && LA14_0<='o')||LA14_0=='q'||(LA14_0>='v' && LA14_0<='z')) ) {s = 13;}

                        else if ( (LA14_0=='\"') ) {s = 14;}

                        else if ( (LA14_0=='\'') ) {s = 15;}

                        else if ( (LA14_0=='/') ) {s = 16;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 17;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||LA14_0==':'||LA14_0=='<'||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}