public class Browser {
    public void navigate(String adress ){
      String ip=findIpAdress(adress);
      String html=SendHtmlRequest(ip);
        System.out.println(html);
    }

    private String SendHtmlRequest(String ip) {
        return "html<>/html>";
    }

    private String findIpAdress(String adress) {
        return "127.0.0.1";
    }
}
