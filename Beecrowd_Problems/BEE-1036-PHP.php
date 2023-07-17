<?php
    $Value = explode(' ', trim(fgets(STDIN)));
    /**/
    $A = floatval($Value[0]);
    $B = floatval($Value[1]);
    $C = floatval($Value[2]);
    /**/
    $Delta = sqrt(pow($B, 2) - (4 * $A * $C));
    /**/
    if($Delta >= 0 && $A != 0){
        $X1 = number_format((-$B + $Delta) / (2 * $A), 5, '.', '');
        $X2 = number_format((-$B - $Delta) / (2 * $A), 5, '.', '');
        print "R1 = $X1\n";
        print "R2 = $X2\n";
    }else{
        print "Impossivel calcular\n";
    }
?>
