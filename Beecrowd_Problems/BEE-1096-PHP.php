<?php
    $I = 1;
    while($I <= 9){
        $J = 7;
        for($K = 0; $K < 3; $K++){
            echo "I=$I J=$J\n";
            $J--;
        }
        $I += 2;
    }
?>
