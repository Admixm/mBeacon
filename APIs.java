ADMXBeaconAdServiceLib.init( Activity, ADMXParameters ); // mBeacon SDK를 시작합니다.
ADMXBeaconAdServiceLib.dispose( Context ); // mBeacon SDK를 종료합니다.

ADMXBeaconAdServiceLib.setDebugMode( Context, true ); // SDK의 디버그 로그를 출력할 지 여부입니다.

ADMXBeaconAdServiceLib.removeLocationAcceptInfo( Context ); // 위치정보 제공동의 여부를 초기화합니다.
ADMXBeaconAdServiceLib.checkSelfAllPermissions( Context, ADMXBeaconAdServiceLib.PERMISSIONS ); // SDK 동작에 필요한 권한이 모두 확보되었는지 검사합니다.
