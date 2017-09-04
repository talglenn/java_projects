/**
 * Defines a Piece Worker class.
 * 
 * @author (Talmadge Glenn) 
 * @version (01/19/2016)
 */


// Lab Exercise 1: PieceWorker.java
// PieceWorker class extends Employee.

public class PieceWorker extends Employee 
{
   /* declare instance variable wage */
   /* declare instance variable pieces */
   private double wage;
   private float pieces;
   // five-argument constructor
   public PieceWorker(String first, String last, String ssn,
   double wagePerPiece, float piecesProduced){
      super( first, last, ssn);
      setWage(wagePerPiece);
      setPieces(piecesProduced);
      
   } // end five-argument PieceWorker constructor

   // set wage
   /* write a set method that validates and sets the PieceWorker's wage */
   public void setWage(double wagePerPiece){
       wage = ( wagePerPiece <= 0 ) ? 0.0 : wagePerPiece;   
   }

   // return wage
   /* write a get method that returns the PieceWorker's wage */
   public double getWage(){
       return wage;   
   }

   // set pieces produced
   /* write a set method that validates and sets the number of pieces produced */
   public void setPieces(float piecesProduced){
       pieces = ( piecesProduced <= 0 ) ? 0 : piecesProduced;    
   }
   
   // return pieces produced
   /* write a get method that returns the number of pieces produced */
   public float getPieces(){
       return pieces;    
   }

   // calculate earnings; override abstract method earnings in Employee
   public double earnings()
   {
      /* write code to return the earnings for a PieceWorker */
      return getWage() * getPieces();
   } // end method earnings

   // return String representation of PieceWorker object
   public String toString()
   {
      /* write code to return a string representation of a PieceWorker */
       return String.format( "%s %s; %s: $%,.2f; %s: %.0f", 
         "piece worker: ", super.toString(), 
         "wage per piece", getWage(), 
         "pieces produced", getPieces() );
   } // end method toString
} // end class PieceWorker

