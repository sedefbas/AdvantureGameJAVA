package AdvantureGame;

public class ToolStore extends NormalLoc {

    public ToolStore(Player player ) {
        super(player, "magaza");
    }
    @Override
    boolean onLocation() {
        System.out.println("magazaya hoşgeldiniz");
        System.out.println("1- Silahlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- cikis yap");
        System.out.print("seçiminiz: ");
        int selectedCase = input.nextInt();
        while(selectedCase<1 || selectedCase>3){
            System.out.print("geçersiz deger girdiniz: ");
        }
        switch (selectedCase){
            case 1:
                printWeapon();
                buyWeopen();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                System.out.println("bir daha bekleriz");
               return true;
        }
        return true;
    }
    public void printWeapon(){
        System.out.println("----------silahlar---------");
        System.out.println();
        for (Weapon w : Weapon.weapons()){
            System.out.println( w.getId()+"-"+w.getName()+"<para: "+w.getPrice()+"hasar: "+w.getDamage()+">");
        }
        System.out.println("anlık bakiye: " + this.getPlayer().getMoney());
        System.out.println("----------------------------");

    }

    public void buyWeopen(){
        System.out.print("bir silah seçiniz: ");
        int select = input.nextInt();
        while (select < 1 || select>Weapon.weapons().length){
            System.out.println("geçersiz sayı girdiniz");
            select=input.nextInt();
        }

        Weapon selectWeapon = Weapon.getWeaponObjID(select);
        if(selectWeapon != null){
            if(selectWeapon.getPrice()> this.getPlayer().getMoney()){
                System.out.println("yeterli paranız bulunmamakta.");
                System.out.println("-----------------------");
            }else {
                System.out.println(selectWeapon.getName() +" silahını satın aldınız");
                int balance = this.getPlayer().getMoney()-selectWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("kalan paranız: " + this.getPlayer().getMoney());
                this.getPlayer().getInventory().setWeapon(selectWeapon);
                System.out.println("son silah durumu: " + this.getPlayer().getInventory().getWeapon().getName());
            }
        }
    }

    public void printArmor(){
        System.out.println("armor");
    }

}
