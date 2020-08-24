package creacionales.objetos.singleton.paquetes_clase;

public class CreateBankAccount {
    private static CreateBankAccount newAccount;
    public static int num_Account=0;

    //constructor
    private CreateBankAccount(){

    }

    public static CreateBankAccount getNewAccount() {

        if (newAccount == null){
            newAccount = new CreateBankAccount();
            System.out.println("Nueva cuenta Creada");

        }  else {
            System.out.println("La cuenta ya esta abierta");
        }

        num_Account++;
        return newAccount;

    }

    public static void deleteAccount(){
        if(num_Account==0) System.out.println("No existen cuentas por borrar");
        else {
            num_Account--;
            System.out.println("No existen cuentas por borrar");
        }


    }
    
}