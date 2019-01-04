public class Main {


    Inventory inventory = new Inventory();

    public void displayInventory() {
        System.out.println("Why hello! May I interest you in...");
        for (Toy t : inventory) {
            tryToSell(t);
        }
    }

    public static void main(String[] args) {
        Main store = new Main();
        store.addToy(new Toy("toy1"));
        store.addToy(new Toy("toy2"));
        store.addToy(new Toy("toy3"));
        store.addToy(new Toy("toy4"));
        store.displayInventory();

    }

    private void tryToSell(Toy t) {
        System.out.println("lovely " + t + "?");
    }
    public void addToy(Toy t) {
        inventory.add(t);
    }

}
