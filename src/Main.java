import org.omg.CORBA.INTERNAL;

import static java.util.stream.Collectors.groupingBy;

public class Main {
//    public static void main(String args[]) {

//        String line = "13 2334";
//        String pattern2 = "^\\d{1,3}\\s\\d{4}\\s\\d{4}$";
//        if (Pattern.matches(pattern2,line)){
//            System.out.println("yes");
//        } else {
//            System.out.println("no match");
//        }


//        String reg = ".*\\/\\/([^\\/\\:]*).*";
//        String str1 = "http://192.168.1.6:9999/caservice/webservice/caServiceWs?wsdl ";
//        System.out.println (str1.replaceAll (reg, "$1"));
//        String str2 = "http://192.168.1.6/caservice/webservice/caServiceWs?wsdl";
//        System.out.println (str2.replaceAll (reg, "$1"));



//    }


//    /** 多次使用的话不需要重新编译正则表达式了，对于频繁调用能提高效率 */
//    public static final String patternString1 = "[^\\s]*((<\\s*[aA]\\s+href\\s*=([^>]+\\s*)>)(.*)</[aA]>).*";
//    public static final String patternString2 = ".*(<\\s*[aA]\\s+(href\\s*=[^>]+\\s*)>(.*)</[aA]>).*";
//    public static final String patternString3 = ".*href\\s*=\\s*(\"|'|)http://.*";
//    public static Pattern pattern1 = Pattern.compile(patternString1,
//            Pattern.DOTALL);
//    public static Pattern pattern2 = Pattern.compile(patternString2,
//            Pattern.DOTALL);
//    public static Pattern pattern3 = Pattern.compile(patternString3,
//            Pattern.DOTALL);
//
//    /**
//     * @param args
//     */
//    public static void main(String[] args) {
//        /** 测试的数据 */
//        String ss = "这是测试<a href=http://www.google.cn>www.google.cn</a>真的是测试了";
//
//        /** 保存提取出来的url,用set从某种程度去重，只是字面上，至于语义那就要需要考虑很多了 */
//        Set<String> set = new HashSet<String>();
//
//        /** 解析url并保存在set里  Set是一个不包含重复元素的 collection */
//        parseUrl(set, ss);
//
//        /** 针对解析出来的url做处理 */
//        System.out.println(replaceHtml(set, ss));
//        //这是测试<a href=http://www.google.cn  target="_blank">www.google.cn</a>真的是测试了
//    }
//
//    /** 给每个url加上target属性 */
//    public static String replaceHtml(Set<String> set, String var) {
//        String result = null;
//        /** 最好不要对参数修改 */
//        result = var;
//        Iterator<String> ite = set.iterator();
//        while (ite.hasNext()) {
//            String url = ite.next();
//            if (url != null) {
//                result = result.replaceAll(url, url + "  target=\"_blank\"");
//
//            }
//        }
//        return result;
//    }
//
//    /** 解析url并保存在set里  Set是一个不包含重复元素的 collection */
//    public static void parseUrl(Set<String> set, String var) {
//        Matcher matcher = null;
//        String result = null;
//        // 假设最短的a标签链接为 <a href=http://www.a.cn></a>则计算他的长度为28
//        if (var != null && var.length() > 28) {
//            matcher = pattern3.matcher(var);
//            // 确定句子里包含有链接
//            if (matcher != null && matcher.matches()) {
//                matcher = pattern1.matcher(var);
//                String aString = null;
//                String bString = null;
//
//                while (matcher != null && matcher.find()) {
//                    if (matcher.groupCount() > 3) {
//                        //System.out.println(matcher.groupCount());//4
//
//                        //System.out.println(matcher.group(0));//group(0) 所有待测试字符串 这是测试<a href=http://www.google.cn>www.google.cn</a>真的是测试了
//
//                        bString = matcher.group(matcher.groupCount() - 3);// 这个group包含所有符合正则的字符串 group(1)
//                        //System.out.println(bString);   //<a href=http://www.google.cn>www.google.cn</a>
//
//                        aString = matcher.group(matcher.groupCount() - 2);// 这个group包含url的html标签  group(2)
//                        //System.out.println(aString);  //<a href=http://www.google.cn>
//
//                        String url1 = matcher.group(matcher.groupCount() - 1);// 最后一个group就是url group(3)
//                        //System.out.println(url1);  //http://www.google.cn
//
//                        set.add(url1);// 将找到的url保存起来
//
//                        bString = bString.replaceAll(aString, "");// 去掉已经找到的url的html标签
//                        //System.out.println(bString);//www.google.cn</a>
//                    }
//
//                }
//                if (bString != null) {
//                    parseUrl(set, bString);// 继续循环提取下一个url
//                }
//            }
//        }
//    }





    public static void main(String[] args){
        Integer a = 2111;
        Integer b = a;
        a = 3;
        System.out.println(a == b);

    }
}



