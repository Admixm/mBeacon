import net.admixm.mbeacon.ADMXBeaconAdServiceLib;
import net.admixm.mbeacon.parameters.ADMXParameters;

...

private void initADMXLibrary( )
{
    ADMXParameters params = new ADMXParameters();

    // 애드믹스엠 홀딩스에서 발급받은 어플리케이션 코드를 기입합니다.
    params.ApplicationCode = applicationCode;

    // 스캔할 비콘 uuid 리스트를 작성합니다.
    params.BeaconUUIDList = new ArrayList< >( );
    params.BeaconUUIDList.add( "6bed2915-45e9-45fd-885a-7c648112119a" );
    params.BeaconUUIDList.add( "B9407F30-F5F8-466E-AFF9-25556B57FE6D" );
    params.BeaconUUIDList.add( "e2c56db5-dffb-48d2-b060-d0f5a71096e0" );
    params.BeaconUUIDList.add( "7b3f5509-7cf1-4637-a87a-5d44e43cdbd7" );
    params.BeaconUUIDList.add( "73a8edce-1227-9db7-18ff-6243e19db53d" );
    params.BeaconUUIDList.add( "c276ea6f-7de8-444a-9904-7ead820de7d9" );

    // SDK의 디버그 로그를 출력할 지 여부입니다.
    // 값을 'true'로 둘 경우 로그를 출력합니다.
    // 디버그용 옵션이며 기본값은 false입니다.
    ADMXBeaconAdServiceLib.setDebugMode( this, true );

    // mBeacon SDK를 초기화합니다.
    ADMXBeaconAdServiceLib.init( MainActivity.this, params );
}