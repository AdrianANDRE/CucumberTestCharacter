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
    Given This $test works
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
    Given This \$test works
    #ok
  Scenario: Test !
    Given This ! works
    #ok
  Scenario: Test ?
    Given This ? works
    #ok
  Scenario: Test *
    Given This * works
    #ok
  Scenario: Test ,
    Given This , works
  Scenario: Test .
    Given This . works
  Scenario: Test +
    Given This + works
  Scenario: Test -
    Given This - works
  Scenario: Test _
    Given This _ works
  Scenario: Test ~
    Given This ~ works
  Scenario: Test @
    Given This @ works
  Scenario: Test €
    Given This € works
  Scenario: Test ç
    Given This ç works
  Scenario: Test é
    Given : This é works
  Scenario: Test =
    Given This = works
  Scenario: Test à
    Given This à works
  Scenario: Test û
    Given This û works
  Scenario: Test ./test
    Given This ./test works
  