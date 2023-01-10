Feature: test feature character

    #ok
  Scenario: Test "
    Given This " works
    #ok
  Scenario: Test '
    Given This ' works
    #ok
  Scenario: Test ` echo test `
    Given This ` echo test ` works
    #ok
  Scenario: Test $test
    Given This \$test works
    #ok
  Scenario: Test & echo toto
    Given This & echo toto works
    #ok
  Scenario: Test ; echo toto
    Given This ; echo toto works
    #ok
  Scenario: Test | echo toto
    Given This | echo toto works
    #ok
  Scenario: Test echo test < /tmp
    Given This echo test < /tmp works
    #ok
  Scenario: Test echo test > /tmp
    Given This echo test > /tmp works
    #ok
  Scenario: Test ^
    Given This ^ works
    #ok
  Scenario: Test %test%
    Given This %test% works
    #ok
  Scenario: Test { echo test }
    Given This { echo test } works
    #ok
  Scenario: Test \
    Given This \ works
    #ok
  Scenario: Test /
    Given This / works
    #ok
  Scenario: Test $(echo test)
    Given This $(echo test) works
    #ok
  Scenario: Test #test
    Given This #test works
    #ok
  Scenario: Test 𨱏
    Given This 𨱏 works
    #ok
  Scenario: Test 👩‍❤️‍💋‍👨
    Given This 👩‍❤️‍💋‍👨  works
    #ok
  Scenario: Test [test]
    Given This [test] works
    #ok
  Scenario: Test ^^
    Given This ^^ works
    #ok
  Scenario: Test "test"
    Given This "test" works
    #ok
  Scenario: Test 'test'
    Given This 'test' works
    #ok
  Scenario: Test \$test
    Given This \\$test works
    #ok
  Scenario: Test !
    Given This ! works
    #ok
  Scenario: Test ?
    Given This ? works
    #ok
  Scenario: Test +-_.~@€çé=àû
    Given This +-_.~@€çé=àû works