package com.zf.test;

import org.springframework.util.CollectionUtils;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

/**
 * Created by chris on 16/11/12.
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].toExternalForm());
        }
        System.out.println("Test2.main");
        System.out.println(System.getProperty("sun.boot.class.path"));

    }

    private static URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();

    private static Method addMethod = initAddMethod();

    public static void addClassPath() throws FileNotFoundException {

        List<URL> urlList = loadAllURL();

        if (CollectionUtils.isEmpty(urlList)) {
            return;
        }

        for (URL url : urlList) {
            addURL(url);
        }

    }

    private static List<URL> loadAllURL() throws FileNotFoundException {
//        List<URL> urlList = new ArrayList<URL>();
//        File baseDir = new File(rootDir);
//
//        if (!baseDir.exists()) {
//            LOGGER.error("can not find defaultRepositoryPath");
//            throw new FileNotFoundException("base file not find ! file:" + rootDir);
//        }
//
//        findURLs(baseDir, urlList);
//
//        return urlList;
        return null;
    }

    private static void addURL(URL file) {
        try {
            addMethod.invoke(classLoader, new Object[] { file });
        } catch (Exception e) {
        }
    }

    private static Method initAddMethod() {
        try {
            Method add = URLClassLoader.class.getDeclaredMethod("addURL", new Class[] { URL.class });
            add.setAccessible(true);
            return add;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
