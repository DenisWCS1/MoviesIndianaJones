public class Movies {
    static String[] films = { "La dernière croiade", "Le temple maudit", "l'arche perdu" };
    static String[][] actors = {
            { "Harrison Ford", "Sean Connery", "Denholm Elliott" },
            { "Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan" },
            { "Harrison Ford", "Karen Allen", "Paul Freeman" } };

    public static void main(String[] args) {

        for (int i = 0; i < films.length; i++) {
            System.out.println("Dans le film " + films[i] + " les acteur sont ");
            for (int j = 0; j < actors.length; j++) {
                System.out.println(actors[i][j]);

            }
            System.out.println("");
        }

    }
}