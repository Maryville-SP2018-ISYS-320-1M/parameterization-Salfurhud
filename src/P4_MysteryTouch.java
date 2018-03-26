/*
	ISYS 320
	Name(s):AlfuhrudSolomon
	Date: March25, 2018
*/

/*
 4. Your output prediction:
	touch your eye touch your head
	touch your head touch your eye
	touch your shoulders touch your elbow
	touch your eye and ears touch your eye and ears
	touch your toes touch your Toes
	touch your shoulders touch your knees toes
  
 */

/*
 6. Were you correct? Explain if you were not (what did you learn?)
 	Yes, I was correct.
 
 */

public class P4_MysteryTouch {

    
public static void main(String[] args) {
       String head="shoulders";
       String knees="toes";
       String elbow="head";
       String eye="eye and ears";
       String ear="eye";
       touch(ear, elbow);
       touch(elbow, ear);
       touch(head, "elbow");
       touch(eye, eye);
       touch(knees, "Toes");
       touch(head, "knees "+knees);

       

       
    }
public static void touch(String elbow, String ear){
    System.out.println("touch your "+elbow+" touch your "+ear);
}
}