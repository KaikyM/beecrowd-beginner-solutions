<?php
    $I = 1; $J = 7;
    while($I <= 9){
        for($K = 0; $K < 3; $K++){
            echo "I=$I J=$J\n";
            $J--;
        }
        $J += 5;
        $I += 2;
    }
?>
