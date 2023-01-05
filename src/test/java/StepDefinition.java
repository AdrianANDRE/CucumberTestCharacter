import io.cucumber.java.en.Given;

public class StepDefinition {


    @Given("i am alive")
    public void i_am_alive() {
        System.out.println("I am alive!");
    }
    @Given("This \" works")
    public void this_works_double_quote() {
        System.out.println("I am alive \"");

    }
    @Given("This ' works")
    public void this_works_simple_quote() {
        System.out.println("I am alive '");

    }

    @Given("This ` works")
    public void this_works_grave_accent() {
        System.out.println("I am alive `");

    }


    @Given("This $ works")
    public void this_$_works() {
        System.out.println("I am alive $");

    }

    @Given("This & works")
    public void this_works_ampersan() {
        System.out.println("I am alive &");

    }

    @Given("This ; works")
    public void this_works_semicolon() {
        System.out.println("I am alive ;");

    }

    @Given("This | works")
    public void this_works_pipe() {
        System.out.println("I am alive |");

    }

    @Given("This < works")
    public void this_works_openbracket() {
        System.out.println("I am alive <");

    }
    @Given("This ^ works")
    public void this_works_caret() {
        System.out.println("I am alive ^");

    }

    @Given("This % works")
    public void this_works_percent() {
        System.out.println("I am alive %");

    }
    @Given("This \\{} works")
    public void this_works_brace() {
        System.out.println("I am alive {}");

    }
    @Given("This > works")
    public void this_works_closebracket() {
        System.out.println("I am alive >");

    }
    @Given("This \\\\ works")
    public void this_works_backslash() {
        System.out.println("I am alive \\");

    }

    @Given("This \\/ works")
    public void this_works_slash() {
        System.out.println("I am alive \\/");

    }
    @Given("This \\() works")
    public void this_works_parenthesis() {
        System.out.println("I am alive \\()");

    }

    @Given("This # works")
    public void this_works_hash() {
        System.out.println("I am alive #");

    }
    @Given("This 𨱏 works")
    public void this_works_asian() {
        System.out.println("I am alive 𨱏");
    }
    @Given("This 👩‍❤️‍💋‍👨  works")
    public void this_‍_️‍_‍_works() {
        System.out.println("I am alive \uD83D\uDC69\u200D❤️\u200D\uD83D\uDC8B\u200D\uD83D\uDC68 ");
    }
}

