
import io.cucumber.java.en.Given;


public class CharacterStepdefinition {


    @Given("This \" works")
    public void this_works_double_quote() {
        System.out.println("I am alive \"");

    }

    @Given("This ' works")
    public void this_works_simple_quote() {
        System.out.println("I am alive '");
    }

    @Given("This ` echo test ` works")
    public void this_echo_test_works() {
        System.out.println("` echo test `");

    }

    @Given("This $test works")
    public void this_dollar_test_works() {
        System.out.println("i am alive $test");
    }


    @Given("This & echo toto works")
    public void this_apersand_echo_toto_works() {
        System.out.println("& echo toto");

    }

    @Given("This ; echo toto works")
    public void this_semicolon_echo_toto_works() {
        System.out.println("; echo toto");

    }

    @Given("This | echo toto works")
    public void this_pipe_echo_toto_works() {
        System.out.println("| echo toto");

    }


    @Given("This echo test < \\/tmp works")
    public void this_echo_test_lessthan_tmp_works() {
        System.out.println("echo test < \\/tmp");

    }


    @Given("This echo test > \\/tmp works")
    public void this_echo_test_greaterthan_tmp_works() {
        System.out.println("echo test > \\/tmp");

    }

    @Given("This ^ works")
    public void this_works_caret() {
        System.out.println("I am alive ^");
    }

    @Given("This %test% works")
    public void this_percent_test_percent_works() {
        System.out.println("%test%");

    }


    @Given("This \\{ echo test } works")
    public void this_brace_works_brace() {
        System.out.println("{ echo test }");


    }

    @Given("This $\\(echo test) works")
    public void this_$_echo_test_works() {
        System.out.println("$\\(echo test)");

    }

    @Given("This #test works")
    public void this_hash_test_works() {
        System.out.println("#test");

    }

    @Given("This 𨱏 works")
    public void this_works_asian() {
        System.out.println("I am alive 𨱏");
    }

    @Given("This 👩‍❤️‍💋‍👨  works")
    public void this_‍_️‍_‍_works() {
        System.out.println("I am alive \uD83D\uDC69\u200D❤️\u200D\uD83D\uDC8B\u200D\uD83D\uDC68 ");
    }

    @Given("This [test] works")
    public void this_test_works() {
        System.out.println("i am alive [test]");

    }

    @Given("This ^^ works")
    public void this_double_caret_works() {
        System.out.println("i am alive ^^");

    }

    @Given("This \"test\" works")
    public void this_doublequote_test_doublequote_works() {
        System.out.println("i am alive \"test\"");

    }


    @Given("This 'test' works")
    public void this_simplequote_works() {
        System.out.println("i am alive \'test\'");

    }

    @Given("This \\\\$test works")
    public void this_backslash_dollar_test_works() {
        System.out.println("i am alive \\$test");
    }


    @Given("This ! works")
    public void this_exclamation_works() {
        System.out.println("i am alive !");

    }

    @Given("This ? works")
    public void this_question_mark_works() {
        System.out.println("i am alive ?");

    }

    @Given("This * works")
    public void this_asterisk_works() {
        System.out.println("i am alive *");

    }

    @Given("This , works")
    public void this_comma_works() {
        System.out.println("i am alive ,");
    }
    //TODO Check if those methods are alredy implement and implement other
    @Given("This \\\\ works")
    public void this_backslash_works() {
        System.out.println("I am alive backslash");
    }

    @Given("This \\/ works")
    public void this_slash_works() {System.out.println("I am alive slash");
    }

    @Given("This . works")
    public void this_dot_works() {
        System.out.println("I am alive dot");    }

    @Given("This + works")
    public void this_plus_works() {
        System.out.println("I am alive plus");    }

    @Given("This - works")
    public void this_minus_works() {
        System.out.println("I am alive minus");    }

    @Given("This _ works")
    public void this___works() {
        System.out.println("I am alive underscore");    }

    @Given("This ~ works")
    public void this_tilde_works() {
        System.out.println("I am alive Tilde");    }

    @Given("This @ works")
    public void this_works() {
        System.out.println("I am alive @");    }

    @Given("This € works")
    public void this_€_works() {
        System.out.println("I am alive euros");    }

    @Given("This ç works")
    public void this_ç_works() {
        System.out.println("I am alive ç");    }

    @Given(": This é works")
    public void this_é_works() {
        System.out.println("I am alive é");    }

    @Given("This = works")
    public void this_equals_works() {System.out.println("I am alive equals");
    }

    @Given("This à works")
    public void this_à_works() {
        System.out.println("I am alive à");    }

    @Given("This û works")
    public void this_û_works() {
        System.out.println("I am alive û");    }

    @Given("This .\\/test works")
    public void this_dot_slash_test_works() {
        System.out.println("I am alive ./test");    }





}