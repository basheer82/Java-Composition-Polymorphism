public class Client {

    private CurrentAccount CurAcnt;
    private SavingAccount SvgAcnt;

    private int clientId;
    private String name;
    private long nId;
    private String nationality;
    private String DOB;
    private String address;

    private static int clientIdNo = 1;

    public Client(String name, long nId, String nationality, String DOB, String address) {
        this.name = name;
        this.nId = nId;
        this.nationality = nationality;
        this.DOB = DOB;
        this.address = address;
    }

    public Client(CurrentAccount acnt, String name, long nId, String nationality, String DOB, String address, String c) {

        this.CurAcnt =  acnt;
        this.clientId = clientIdNo++;
        this.name = name;
        this.nId = nId;
        this.nationality = nationality;
        this.DOB = DOB;
        this.address = address;
    }
    public Client(SavingAccount acnt, String name, long nId, String nationality, String DOB, String address) {

        this.SvgAcnt =  acnt;
        this.clientId = clientIdNo++;
        this.name = name;
        this.nId = nId;
        this.nationality = nationality;
        this.DOB = DOB;
        this.address = address;
    }
    public SavingAccount getSavingAcount(){
        return SvgAcnt;
    }

    public CurrentAccount getCurrentAccount(){
        return CurAcnt;
    }
}
