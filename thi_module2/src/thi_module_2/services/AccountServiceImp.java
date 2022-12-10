    package thi_module_2.services;
    
    import thi_module_2.model.AccountBank;
    import thi_module_2.model.AccountPayment;
    import thi_module_2.model.AccountSaving;
    import thi_module_2.util.ReadAndWriteFile;
    
    import java.util.ArrayList;
    import java.util.Scanner;
    
    public class AccountServiceImp implements AccountService {
        private static Scanner sc = new Scanner(System.in);
        private static final String FILE_PATH = "D:\\Module_02\\PhamVanHai-A0722i1\\thi_module2\\src\\thi_module_2\\data\\dataaccount.csv";
        private static ArrayList<AccountBank> list = ReadAndWriteFile.readFile(FILE_PATH);
        @Override
        public void addNew() {
            while (true) {
                int choose = sc.nextInt();
                if (choose == 1) {
                    int id = 0;
                    System.out.println("Enter code account");
                    double code = sc.nextDouble();
                    System.out.println("Enter name account");
                    String name = sc.next();
                    System.out.println("Enter day create");
                    String dayCreate = sc.next();
                    System.out.println("Enter card");
                    double card = sc.nextDouble();
                    System.out.println("Enter coin");
                    double coin = sc.nextDouble();
                    list.add(new AccountPayment(id, code, name, dayCreate, card, coin));
                    break;
                } else if (choose == 2) {
                    int id = 0;
                    System.out.println("Enter code account");
                    double code = sc.nextDouble();
                    System.out.println("Enter name account");
                    String name = sc.next();
                    System.out.println("Enter day create");
                    String dayCreate = sc.next();
                    System.out.println("Enter coin saving");
                    double coinSave = sc.nextDouble();
                    System.out.println("Enter day saving");
                    String daySave = sc.next();
                    System.out.println("Enter interest rate");
                    double interestRate = sc.nextDouble();
                    System.out.println("Enter date saving");
                    String dateSave = sc.next();
                    list.add(new AccountSaving(id, code, name, dayCreate, coinSave, daySave, interestRate, dateSave));
                    break;
                } else {
                    System.out.println("Enter error, please re-enter!");
                }
            }
    //        for (int i = 0; i < list.size(); i++) {
    //            list.get(i).setId(i+1);
    //            ReadAndWriteFile.writeFile(list,FILE_PATH);
    //        }
            ReadAndWriteFile.writeFile(list,FILE_PATH);
        }
    
        @Override
        public void display() {
            System.out.println("=== List account ===");
            for (AccountBank lists: list
                 ) {
                System.out.println(lists);
            }
        }
    
        @Override
        public void delete() {
            System.out.println("Enter id need delete :");
            int id = sc.nextInt();
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getId() == id) {
                    list.remove(i);
                    ReadAndWriteFile.writeFile(list,FILE_PATH);
                }
            }
        }

        @Override
        public void find() {
            System.out.println("Enter name need find:");
            String enter = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
               if (enter.contains(list.get(i).getAccountName())){
                   System.out.println(list.get(i));
               }
            }
        }
    }
