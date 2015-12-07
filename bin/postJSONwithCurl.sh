for (( i = 1; i <= $1; i++ ));
  do curl -H "Content-Type:application/json" --data-binary @../src/test/resources/test.json http://localhost:$2/echo;
  echo "post#$i"
done;
