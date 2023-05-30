import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String userName,password;
        byte right=3;
        byte select;
        int price;
        int balance=2500;

        while (right>0){
            System.out.println("Kullanıcı Adı: ");
            userName=input.nextLine();
            System.out.println("Şifre: ");
            password=input.nextLine();
            if(userName.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhaba X bankasına hoşgeldiniz.");
                do {
                    System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextByte();
                    switch (select){
                        case 1:
                            System.out.println("Para miktarını giriniz: ");
                            price=input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.println("Para miktarını giriniz: ");
                            price=input.nextInt();
                            if (price>balance){
                                System.out.println("Yetersiz bakiye!");
                            }
                            else
                                balance-=price;
                            break;
                        case 3:
                            System.out.println("Bakiye: "+ balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("İyi günler");
                break;
            }
            else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçin.");
                } else
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }

