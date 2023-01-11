import cucumber.api.java.en.Given;

public class StepDefinition {


    @Given("i am alive")
    public void i_am_alive() {
        System.out.println("I am alive!");
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


    @Given("This \\() works")
    public void this_works_parenthesis() {
        System.out.println("I am alive \\()");

    }

    @Given("This # works")
    public void this_works_hash() {
        System.out.println("I am alive #");

    }


}

