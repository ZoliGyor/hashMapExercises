public class Main
{
    public static void main(String[] args)
    {
        Exercises table1 = new Exercises();
        Exercises table2 = new Exercises();

        table1.exercise1(table1.getExercises(), 1);
        table2.exercise1(table2.getExercises(), 2);

        table1.exercise2(table1.getExercises());
        table1.exercise3(table1.getExercises(), table2.getExercises());
        table1.exercise4(table1.getExercises());
        table1.exercise5(table1.getExercises());

        table2.exercise6(table2.getExercises(), table1.getExercises());
        table2.exercise7(table2.getExercises(), "Veth");
        table2.exercise8(table2.getExercises(), 11);
    }
}
