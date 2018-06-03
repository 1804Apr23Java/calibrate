export class Account {

    public accountId: number;
    public email: string;
    public isAdmin: boolean;
    public password: string;
    public username: string;

    
    constructor (accountId: number, username: string, password: string, email: string, isAdmin: boolean) {
    
    this.accountId = accountId;
    this.email = email;
    this.isAdmin = isAdmin;
    this.password = password;
    this.username = username;
    
    }

}