public class Main
{
    public static void main(String[] args)
    {
        Exercises exercises = new Exercises();
        Exercises emptyMap = new Exercises();

        exercises.exercise1(exercises.getExercises());
        exercises.exercise2(exercises.getExercises());
        exercises.exercise3(exercises.getExercises(), emptyMap.getExercises());
    }
}
