if [ -z "$JMETER_HOME" ];
  then
    echo "JMETER_HOME not set, this script requires Apache JMeter. Please ensure it is installed and the JMETER_HOME environment variable is set."
    exit 1
fi

jmeter.sh -t ../src/test/resources/sendTestJSON.jmx
