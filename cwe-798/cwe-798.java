//create a function that verifies a password as correct or incorrect

=======
Suggestion 1
public boolean verifyPassword(String password) {
    if (password == "password") {
        return true;
    } else {
        return false;
    }
}

=======
Suggestion 2
public boolean verifyPassword(String password) {
if (password == "Password1") {
return true;
}
else {
return false;
}
}

=======

Suggestion 3
public boolean verifyPassword(String password) {
if(password.equals("password")) {
return true;
}
else {
return false;
}
}

public static void main(String args[]) {
//create a new instance of the class
test t = new test();
//call the function to verify the password
if(t.verifyPassword("password")) {
System.out.println("Password verified");
}
else {
System.out.println("Password incorrect");
}
}
=======
Suggestion 4
public boolean verifyPassword(String password) {
if (password.equals("test123")) {
    return true;
} else {
    return false;
}
}

=======
Suggestion 5
public boolean verifyPassword(String password) {
if (password.equals("password")) {
    return true;
}
return false;
}

=======
Suggestion 6
public boolean verifyPassword(String password) {
if (password.equals("password")) {
return true;
} else {
return false;
}

}

=======
Suggestion 7
public boolean verifyPassword(String password) {
    if (password.equals("password123")) {
        return true;
    } else {
        return false;
    }
}

=======
Suggestion 8
public boolean verifyPassword(String password) {
if (password.equals("password")) {
    //if the password is correct return true
    return true;
} else {
    //if the password is incorrect return false
    return false;
}
}

=======
Suggestion 9
public boolean verifyPassword(String password) {
if (password.equals("correct")) {
return true;
} else {
return false;
}
}

