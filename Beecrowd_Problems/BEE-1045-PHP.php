<?php
    $Value = explode(' ', trim(fgets(STDIN)));
    //
    $A = floatval($Value[0]);
    $B = floatval($Value[1]);
    $C = floatval($Value[2]);
    $abc = 0.0;
    //
    if($B > $A && $B > $C){
        $abc = $A;
        $A = $B;
        $B = $abc;
    }else if($C > $A){
        $abc = $A;
        $A = $C;
        $C = $abc;
    }
    //
    if($A >= $B + $C){
        print "NAO FORMA TRIANGULO\n";
    }else{
        if($A*$A == $B*$B + $C*$C){print "TRIANGULO RETANGULO\n";}
        //
        if($A*$A > $B*$B + $C*$C){print "TRIANGULO OBTUSANGULO\n";}
        //
        if($A*$A < $B*$B + $C*$C){print "TRIANGULO ACUTANGULO\n";}
        //
        if($A == $B && $B == $C){print "TRIANGULO EQUILATERO\n";}
        //
        if(($B == $A && $A != $C)|| ($A == $C && $C != $B) || ($C == $B && $B != $A)){
            print "TRIANGULO ISOSCELES\n";}
    }
?>
