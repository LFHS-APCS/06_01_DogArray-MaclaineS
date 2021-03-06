public class DogArray
{

    /**
     *  Returns the index of the youngest dog in the given array
     */
    public static int getYoungestIndex(Dog[] dogs)
    {
      int index=0;
      for(int i=0;i<dogs.length;i++){
        if(dogs[i].getAge()<dogs[index].getAge()){
          index=i;
        }
      }
      return index;
    }
      
    

    /**
     *  Returns the name of the youngest dog in the given array
     */
    public static String getYoungestName(Dog[] dogs)
    {
      int index=getYoungestIndex(dogs);
      return dogs[index].getName();
    }
}
