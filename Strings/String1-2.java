/*Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false*/



public boolean endsLy(String str) {
  String checkly = "";
  boolean doesend = false;
  
  if(str.length() < 2){
    doesend = false;
    
  }
  
  else{
    String ly = "ly";
    if(str.substring(str.length()-2,str.length()).equals(ly)){
       doesend = true;
       
    }
    else{
      doesend = false;
    }
    
    
  }
  
  return doesend;
}
