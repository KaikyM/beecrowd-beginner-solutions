<?php
    $P1 = explode(' ',trim(fgets(STDIN)));
    $P2 = explode(' ',trim(fgets(STDIN)));
    /**/
    $Distance = sqrt(pow($P2[0] - $P1[0], 2) + pow($P2[1] - $P1[1], 2));
    /**/
    print (number_format(($Distance), 4, '.', '')."\n");
?>
