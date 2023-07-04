<?php
    $radius = fgets(STDIN);
    $pi = 3.14159;
    $area = number_format(round(pow($radius, 2) * $pi, 4), 4, '.', '');
    print "A=$area\n";
?>
