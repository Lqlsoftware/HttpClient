package HttpClient;
import java.net.URL;
public class HttpClient {
	// 构造函数
	public static HttpClient(String spec);
	public static HttpClient(String protocol, String host, int port, String file);
	public static HttpClient(String protocol, String host, int port, String file, URLStreamHandler handler);
	public static HttpClient(String protocol, String host, String file);
	public static HttpClient(URL context, String spec);
	public static HttpClient(URL context, String spec, URLStreamHandler handler);
	// 方法
	public static boolean	equals(Object obj);
	public static String	getAuthority();
	public static Object	getContent();
	public static Object	getContent(Class[] classes);
	public static int	getDefaultPort();
	public static String	getFile();
	public static String	getHost();
	public static String	getPath();
	public static int	getPort();
	public static String	getProtocol();
	public static String	getQuery();
	public static String	getRef();
	public static String	getUserInfo();
	public static int	hashCode();
	public static HttpConnection	 openConnection();
    public static HttpConnection	 openConnection(Proxy proxy);
    public static InputStream	openStream();
    public static boolean	sameFile(URL other);
	protected void	set(String protocol, String host, int port, String file, String ref);
	protected void	set(String protocol, String host, int port, String authority, String userInfo, String path, String query, String ref);
	static void	setURLStreamHandlerFactory(URLStreamHandlerFactory fac);
	public static String	toExternalForm();
	public static String	toString();
	public static URI	toURI();
}
