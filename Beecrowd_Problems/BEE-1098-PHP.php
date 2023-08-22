<?php
    $I = 0; $J = 1;
    while($I <= 2){
        for($K = 0; $K < 3; $K++){
            echo "I=$I J=$J\n";
            $J++;
        }
        $J -= 3;
        $J += 0.2;
        $I += 0.2;
    }
?>
