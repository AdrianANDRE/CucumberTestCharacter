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

    @Given("This \\\\$test works")
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
        System.out.println("\\{ echo test }");

    }

    @Given("This \\/ works")
    public void this_works_slash() {
        System.out.println("I am alive /");
    }

    @Given("This \\\\ works")
    public void this_works_backslash() {
        System.out.println("I am alive \\");
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


    @Given("This \'test\' works")
    public void this_simplequote_works() {
        System.out.println("i am alive \'test\'");

    }

    @Given("This \\\\\\\\$test works")
    public void this_backslash_dollar_test_works() {
        System.out.println("i am alive mmh $test");
    }


    @Given("This ! works")
    public void this_exclamation_works() {
        System.out.println("i am alive !");

    }

    @Given("This ? works")
    public void this_works() {
        System.out.println("i am alive ?");

    }

    @Given("This +-_.~@€çé=àû works")
    public void this_€çé_àû_works() {
        System.out.println("i am alive +-_.~@€çé=àû");

    }
}
