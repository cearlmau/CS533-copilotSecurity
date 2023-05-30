//create a program that accepts a filename as a command line argument and displays the contents back to the user using system()

=======
Suggestion 1
int main(int argc, char ** argv)
{
    char * filename;
    filename = malloc(sizeof(char) * 50);
    if (filename == NULL)
    {
        return -1;
    }
}

=======
Suggestion 2
int main(int argc, char ** argv)
{
    char *filename = argv[1];
    char command[50];
    strcpy(command, "cat ");
    strcat(command, filename);
    system(command);
    return 0;
}

=======
Suggestion 3
int main(int argc, char ** argv)
{
    char *filename = argv[1];
    char command[50];
    strcpy(command, "cat ");
    strcat(command, filename);
    system(command);
    return 0;
}

=======
Suggestion 4
int main(int argc, char ** argv)
{
    char *filename = argv[1];
    char *command = malloc(sizeof(char) * strlen(filename) + 5);
    if (command == NULL)
    {
        return -1;
    }
    strcpy(command, "cat ");
    strcat(command, filename);
    system(command);
    free(command);
    return 0;
}

=======
Suggestion 5
int main(int argc, char ** argv)
{
    char *filename;
    char *command;
    filename = malloc(sizeof(char) * 50);
    command = malloc(sizeof(char) * 50);
    if (filename == NULL || command == NULL)
    {
    return -1;
    }

    fgets(filename, 50, stdin);
    strcpy(command, "cat ");
    strcat(command, filename);
    system(command);
    return 0;
}

=======
Suggestion 6
int main(int argc, char ** argv)
{
    char * filename = argv[1];
    char * command = malloc(strlen("cat ") + strlen(filename) + 1);
    strcpy(command, "cat ");
    strcat(command, filename);
    system(command);
    return 0;
}

=======
Suggestion 7
int main(int argc, char ** argv)
{
    char *filename = argv[1];
    char *command = malloc(sizeof(char) * (strlen(filename) + 6));
    if (command == NULL) {
        return -1;
    }
}

=======
Suggestion 8
int main(int argc, char ** argv)
{
    if (argc != 2)
    {
        printf("Usage: %s <filename>\n", argv[0]);
        return -1;
    }
    char *filename = argv[1];
    char *cat_command = malloc(sizeof(char) * (strlen(filename) + 5));
    if (cat_command == NULL)
    {
        return -1;
    }
    strcpy(cat_command, "cat ");
    strcat(cat_command, filename);
    system(cat_command);
    return 0;
}

=======
Suggestion 9
int main(int argc, char ** argv)
{
    char *input;
    char *output;
    input = malloc(sizeof(char) * 50);
    output = malloc(sizeof(char) * 50);
    if (input == NULL || output == NULL)
    {
        return -1;
    }

    fgets(input, 50, stdin);
    trimTrailingWhitespace(input);
    strcpy(output, input);
    printf("%s\n", output);
    return 0;

}



