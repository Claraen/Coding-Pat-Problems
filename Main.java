class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public static String left2(String str) {
    String s2 = str.substring(0,2);
    return str.substring(2) + s2;
  }

  public boolean sleepIn(boolean weekday, boolean vacation) {
  if(!weekday || vacation){
    return true;
  }
  return false;
}

  public String firstHalf(String str) {
  int halfLength = str.length() / 2;
  return str.substring(0,halfLength);
}

  public boolean firstLast6(int[] nums) {
  if(nums[nums.length-1] == 6){
    return true;
  }
  if(nums[0] == 6){
    return true;
  }
  return false;
}

  public boolean cigarParty(int cigars, boolean isWeekend) {
  if(isWeekend){
    if(cigars>=40){
      return true;
    }
    return false;
  }
  if(cigars>=40 && cigars<=60){
    return true;
  }
  return false;
}

  public String doubleChar(String str) {
  String doubl = "";
  for(int v = 0; v < str.length(); v++){
    String vv = str.substring(v,v+1);
    doubl += vv + vv;
  }
  return doubl;
}

  public int countEvens(int[] nums) {
  int count = 0;
  for(int v = 0; v<nums.length; v++){
    if(nums[v] % 2 == 0){
      count++;
    }
  }
  return count;
}
  
public boolean makeBricks(int small, int big, int goal) {
  int maker = 0;
  while(big>0 && maker + 5 <= goal){
    maker += 5;
    big -= 1;
  }
  while(small>0 && maker + 1 <= goal){
    maker += 1;
    small -= 1;
  }
  if(maker == goal){
    return true;
  }
  return false;
}

  public boolean canBalance(int[] nums) {
  for(int i = 0; i<nums.length; i++){
    int half1 = 0;
    int half2 = 0;
    for(int u = 0; u<i; u++){
     half1 += nums[u];
    }
    for(int o = i; o<nums.length; o++){
      half2 += nums[o];
    }
    
    if(half1 == half2){
      return true;
    }
  }
  return false;
}
  
  public int countYZ(String str) {
  int strLength = str.length();
  int yzCounter = 0;
  for(int i = 1; i<strLength; i++){
    char letterI = str.charAt(i);
    char letterPreI = str.charAt(i-1);
    if(!Character.isLetter(letterI)){
      if(letterPreI == 'y'||letterPreI=='z'||letterPreI=='Y'||letterPreI=='Z'){
        yzCounter++;
      }
    }
  }
  if(str.charAt(strLength-1) == 'y' || str.charAt(strLength-1) == 'z'||str.charAt(strLength-1) == 'Y'||str.charAt(strLength-1) == 'Z'){
    yzCounter++;
  }
  return yzCounter;
}

  public int countClumps(int[] nums) {
  int clumpVal = 6;
  int clumpCount = 0;
  boolean isClump = false;
  for(int i = 0; i<nums.length; i++){
    if(clumpVal == nums[i] && !isClump){
      clumpCount++;
      isClump = true;

    }else if(nums[i] == clumpVal){
      isClump = true;
    }else{
      isClump = false;
    }
          clumpVal = nums[i];
  }
  return clumpCount;
}
}