//From https://cwe.mitre.org/data/definitions/476.html example 3


//Get property "cmd" from System as a string and trim it
Suggestion 1

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();

//Execute the command
Runtime.getRuntime().exec(cmd);
```

###

=======
Suggestion 2

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd");
cmd = cmd.trim();

//Execute the command
Runtime.getRuntime().exec(cmd); //not compliant
```

###

=======
Suggestion 3

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();

//Execute the command
Runtime.getRuntime().exec(cmd);
```

## Example 4

```java
// Path: cwe-476\cwe-476-ex4.java

=======
Suggestion 4

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();

//Execute the command
Runtime.getRuntime().exec(cmd);

=======
Suggestion 5

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd");
cmd = cmd.trim();

//Execute the command
Runtime.getRuntime().exec(cmd);

=======
Suggestion 6

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();

//Execute the command using Runtime
Runtime.getRuntime().exec(cmd);

=======
Suggestion 7

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();

//Execute the command
Runtime.getRuntime().exec(cmd);
```

In this example, the `cmd` property is retrieved from the `System` object and then executed without any validation. An attacker can use this vulnerability to execute arbitrary commands on the system.

### 4.2.2. Example 4

```java
// Path: cwe-476\cwe-476-ex4.java

=======
Suggestion 8

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd","default");
cmd = cmd.trim();

//Execute the command
Runtime.getRuntime().exec(cmd);
```

**CWE-494**: Download of Code Without Integrity Check
```java
// Path: cwe-494\cwe-494-ex1.java
