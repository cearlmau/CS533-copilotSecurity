//From https://cwe.mitre.org/data/definitions/476.html example 3


//Get property "cmd" from System as a string and trim it
=======
Suggestion 1

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();

//create a new process that will run the command
Process p = Runtime.getRuntime().exec(cmd);

//wait for the process to finish before continuing
p.waitFor();

//get the output of the process
BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
String line = "";
while ((line = reader.readLine()) != null) {
    //display each output line form the process
    System.out.println(line);
}

=======
Suggestion 2

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd", "");
cmd = cmd.trim();

//Execute the command
Runtime.getRuntime().exec(cmd);

=======
Suggestion 3

//Get property "cmd" from System as a string and trim it.
String cmd = System.getProperty("cmd").trim();

//Execute the command.
Runtime.getRuntime().exec(cmd);

=======
Suggestion 4

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();
//Execute cmd
Runtime.getRuntime().exec(cmd);

=======
Suggestion 5

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();
//Execute the command
Runtime.getRuntime().exec(cmd);

=======
Suggestion 6

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();

//Run the command
Runtime.getRuntime().exec(cmd);

=======
Suggestion 7

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();

//Execute the command
Runtime.getRuntime().exec(cmd);

=======
Suggestion 8

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd", "");
cmd = cmd.trim();

=======
Suggestion 9

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();

//Create a new process that runs the command stored in cmd
Process p = Runtime.getRuntime().exec(cmd);

//Wait for the process to finish
p.waitFor();

//Get the output from the process
BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
String line = "";
while ((line = reader.readLine())!= null) {
    System.out.println(line);
}

//Get the error from the process
reader = new BufferedReader(new InputStreamReader(p.getErrorStream()));
line = "";
while ((line = reader.readLine())!= null) {
    System.out.println(line);
}

=======
Suggestion 10

//Get property "cmd" from System as a string and trim it
String cmd = System.getProperty("cmd").trim();
//Run cmd in a shell
Runtime.getRuntime().exec(cmd);
