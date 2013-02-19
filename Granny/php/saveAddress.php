<?php
        $postdata = $_REQUEST['data'];
	//var_dump("http://localhost:3000/address/save/".$postdata);
        $ch = curl_init("http://localhost:3000/address/save/".urlencode($postdata));
        //curl_setopt($ch, CURLOPT_CUSTOMREQUEST, 'POST');
        curl_setopt($ch, CURLOPT_POSTFIELDS, $postdata);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, TRUE);
        $ret = curl_exec($ch);
        curl_close($ch);
        echo $ret;
?>
