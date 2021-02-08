public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "M-11";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
