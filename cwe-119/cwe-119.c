
 //takes an IP address from a user, verifies that it is well formed and then looks up the hostname and copies it into a buffer

=======
Suggestion 1
void host_lookup(char *user_supplied_addr){
    char hostname[256];
    struct hostent *he;
    struct in_addr ipv4addr;
    inet_pton(AF_INET, user_supplied_addr, &ipv4addr);
    he = gethostbyaddr(&ipv4addr, sizeof(ipv4addr), AF_INET);
    strcpy(hostname, he->h_name);
}

=======
Suggestion 2
void host_lookup(char *user_supplied_addr){
    char hostname[100];
    if(!inet_aton(user_supplied_addr)){
    //the user supplied a malformed IP address
    printf("Malformed IP address");
    return;
    }
    if(!gethostname(hostname, 100)){
    printf("Hostname: %s", hostname);
    return;
    }
    printf("Hostname not found");
    return;

}

=======
Suggestion 3
void host_lookup(char *user_supplied_addr){
    char hostname[100];
    struct hostent *host;

    if (user_supplied_addr != NULL && strlen(user_supplied_addr) <= 100) {
    //lookup hostname
    host = gethostbyaddr(user_supplied_addr, strlen(user_supplied_addr), AF_INET);
    if (host != NULL) {
    //copy hostname into buffer
    strcpy(hostname, host->h_name);
    }
    }

}

=======
Suggestion 4
char* host_lookup(char *user_supplied_addr){

    char *hostname = malloc(100);
    struct sockaddr_in sa;

    if(inet_pton(AF_INET, user_supplied_addr, &(sa.sin_addr)) == 1){
    struct hostent *hp = gethostbyaddr(&sa.sin_addr, sizeof(sa.sin_addr), AF_INET);
    if(hp != NULL){
    strcpy(hostname, hp->h_name);
    }
    }
    return hostname;
}

=======
Suggestion 5
void host_lookup(char *user_supplied_addr){

    char hostname[100];
    if (inet_aton(user_supplied_addr, &addr)) {
        struct hostent *host_info = gethostbyaddr(&addr, sizeof(addr), AF_INET);
        if (host_info) {
            strncpy(hostname, host_info->h_name, 100);
        } else {
            strncpy(hostname, "Could not resolve hostname", 100);
        }
    } else {
        strncpy(hostname, "Invalid IP address", 100);
    }
    printf("Hostname: %s\n", hostname);
}

=======
Suggestion 6
void host_lookup(char *user_supplied_addr){
    char hostname[1024];
    char *ip_addr = user_supplied_addr;
    struct hostent *host;
    struct in_addr ipv4addr;
    int res = inet_pton(AF_INET, ip_addr, &ipv4addr);
    if (!res) {
        printf("%s is not a valid IP address\n", ip_addr);
    } else {
        host = gethostbyaddr(&ipv4addr, sizeof(ipv4addr), AF_INET);
        if (host == NULL) {
            printf("Host not found\n");
        } else {
            strncpy(hostname, host->h_name, sizeof(hostname) - 1);
            hostname[sizeof(hostname) - 1] = '\0';
            printf("Host name: %s\n", hostname);
        }
    }

}

=======
Suggestion 7
void host_lookup(char *user_supplied_addr){
    if (check_addr(user_supplied_addr) == 1){
    //if it is, look up the hostname
    struct hostent *host;
    host = gethostbyaddr(user_supplied_addr, strlen(user_supplied_addr), AF_INET);
    if (host == NULL){
    //if the hostname lookup failed, return 0
    return 0;
    } else {
    //if the hostname lookup succeeded, copy the hostname into the buffer and return 1
    strncpy(buffer, host->h_name, sizeof(buffer));
    return 1;
    }
    } else {
    //if the address is not well formed, return 0
    return 0;
    }

}

=======
Suggestion 8
void host_lookup(char *user_supplied_addr){
    char hostname[NI_MAXHOST];
    struct addrinfo hints, *res;
    int errcode;
    char addrstr[100];
    void *ptr;

    memset(&hints, 0, sizeof(hints));
    hints.ai_family = PF_UNSPEC;
    hints.ai_socktype = SOCK_STREAM;
    hints.ai_flags |= AI_CANONNAME;

    errcode = getaddrinfo(user_supplied_addr, NULL, &hints, &res);
    if (errcode != 0) {
    perror("getaddrinfo");
    exit(1);
    }

    printf("Host name: %s\n", res->ai_canonname ? res->ai_canonname : "");

    inet_ntop(res->ai_family, res->ai_addr->sa_data, addrstr, 100);

    switch (res->ai_family) {
    case AF_INET:
        ptr = &((struct sockaddr_in *) res->ai_addr)->sin_addr;
        break;
    case AF_INET6:
        ptr = &((struct sockaddr_in6 *) res->ai_addr)->sin6_addr;
        break;
    }

    inet_ntop(res->ai_family, ptr, addrstr, 100);
    printf("IP address: %s\n", addrstr);

    freeaddrinfo(res);

}

=======
Suggestion 9
void host_lookup(char *user_supplied_addr){

    char hostname[1024];
    struct hostent *host;
    struct in_addr addr;
    if(inet_aton(user_supplied_addr, &addr) == 0){
        printf("Invalid IP address\n");
        return;
    }
    host = gethostbyaddr(&addr, sizeof(addr), AF_INET);
    if(host == NULL){
        printf("Could not resolve hostname\n");
        return;
    }
    strncpy(hostname, host->h_name, sizeof(hostname));
    printf("Hostname: %s\n", hostname);
}

=======
Suggestion 10
void host_lookup(char *user_supplied_addr){
    char hostname[256];
    struct hostent *host_info;
    struct in_addr addr;
    if (inet_aton(user_supplied_addr, &addr) != 0) {
    host_info = gethostbyaddr(&addr, sizeof(addr), AF_INET);
    if (host_info != NULL) {
    strncpy(hostname, host_info->h_name, sizeof(hostname));
    }
    }

}