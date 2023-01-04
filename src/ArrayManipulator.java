public class ArrayManipulator {
    private int[] nums;
    private String[] words;

    /** Constructor that returns a new ArrayManipulator
     *  @param nums  The array of nums
     *  @param howManyStrings  How many elements to put in the words array
     */
    public ArrayManipulator(int[] nums, int howManyStrings){
        this.nums = nums;
        words = new String[howManyStrings];
    }


    /** Returns the index of the middle element of nums; if the length of the list
     *  is even, should return the index of the earlier middle element
     *  Precondition: length of nums >= 3
     *
     *  @return  the index of the middle element of nums
     *
     *  Example: if ints[] is {4, 6, 10}, the indices are 0, 1, and 2, so this
    method returns the middle index, 1
     *  Example: if ints[] is {4, 5, 6, 10}, the indices are 0, 1, 2, 3, and two
    middle indices are 1 and 2, so return 1 (te earlier of the two)
     */
    public int getNumsMiddleIndex(){
        int middle = nums.length;

        if(middle % 2 == 1) {
            middle = middle - 1;
            middle = nums.length / 2;
        }
        else{
            middle = (nums.length - 1) / 2;
        }
        return middle;
    }


    /** Returns the average, as a double, of the average of the first, last, and
     *  middle elements of nums; the middle element should be the element at the
     *  index determined by getNumsMiddleIndex
     *
     *  @return  the average of the first, last, and middle elements
     */
    public double getNumsAverage(){
        return ((double)nums[0] + (double)nums[nums.length - 1] + (double)nums[getNumsMiddleIndex()]) / 3;
    }


    /** Returns true if both the nums and words arrays have the same number of
     *  elements, returns false otherwise.
     *
     *  @return  returns true if the two arrays are equal in length; false if not
     */
    public boolean sameLengths(){
        if(nums.length == words.length){
            return true;
        }
        return false;
    }

    /** Updates the element of the words array at index idx to the new value
     *  provided and returns true to indicate a successful update; if, however,
     *  idx exceeds the bounds of the words array, do NOT update the array and
     *  return false to indicate that the update was unsuccessful.
     *
     *  @return  true if the update was successful, false otherwise.
     */
    public boolean updateWordsListAt(int idx, String newValue){
        if(idx >= words.length){
            return false;
        }
        else{
            words[idx] = newValue;
            return true;
        }
    }


    /** Returns the number of characters that are contained in the last element of
     *  the words list; however, if the last element of the array is null return 0
     *
     *  @return  how many characters are in the last element of words; 0 if the
     *           last element is null
     */
    public int howLongLastWord(){
        if (words[words.length - 1] == null) {
            return 0;
        }
        return words[words.length - 1].length();
    }


    // these methods are provided for testing
    // PRECONDITION: idx is a valid index for the given array and does NOT exceed
    //               the array’s bounds!
    public int getNumAt(int idx)
    {
        return nums[idx];
    }

    public String getWordAt(int idx)
    {
        return words[idx];
    }

}
