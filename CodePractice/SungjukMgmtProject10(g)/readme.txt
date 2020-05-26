성적관리프로그램10 
2티어(window10 - client, linux utuntu - Server)
Jdbc - DB연동(mariadb)해서 프로그램 작성  - 192.168.56.2 virtualbox에 있는 것

UI를 통해서 입력받고 데이터는 DB에 저장 (insert만). 저장 후 heidSQL에서 확인가능
학번, 이름, 국어, 영어, 수학을 입력받아서 DB에 저장
	
https://youtu.be/IHLhMixVhEY  / (virtualbox의 mariadb 켜고 HeidSQL로 192.168.56.2 들어감. world database 설정값 - utf_general_8 바꾸기, HeidSQL에서 world.Student 테이블 만듬.)
https://youtu.be/zuJw_vs7WtQ / mariadb driver(.jar) 다운받아서 build path로 추가. 작업~ 
https://youtu.be/bSI0Mwp2QBY / 40분까지

SQL에서 order by 할 것이라서 sort클래스 필요없다.


cf) mariadb driver (.jar파일안에 있는 driver) https://downloads.mariadb.com/Connectors/java/connector-java-2.5.4/ 에서 다운로드하면 됨.
https://youtu.be/zuJw_vs7WtQ 8분경에 다운로드 하는 영상 있음