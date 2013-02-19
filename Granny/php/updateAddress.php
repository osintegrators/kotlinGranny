<?php
        $ch = curl_init("http://localhost:3000/address/update/".$_REQUEST['id']."/".urlencode($_REQUEST['data']));
        curl_setopt($ch, CURLOPT_CUSTOMREQUEST, 'POST');
        curl_setopt($ch, CURLOPT_POSTFIELDS, $postdata);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, TRUE);
        $ret = curl_exec($ch);
        curl_close($ch);
	echo $ret
?>
