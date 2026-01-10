package org.nitisha.CreationalPatterns;

// thread safe
// eager loadinf
//class JudgeAnalytics {
//    private static final JudgeAnalytics judgeAnalytics = new JudgeAnalytics();
//
//    private JudgeAnalytics() {
//    }
//
//    public static JudgeAnalytics getInstance() {
//        return judgeAnalytics;
//    }
//}

// lazy loading
//class JudgeAnalytics {
//    private static JudgeAnalytics judgeAnalytics;
//
//    private JudgeAnalytics() {
//
//    }
//    public static JudgeAnalytics getInstance() {
//        if(judgeAnalytics == null) {
//            judgeAnalytics = new JudgeAnalytics();
//        }
//        return judgeAnalytics;
//    }
//}


// thread safe
// synchronized
//class JudgeAnalytics {
//    private static JudgeAnalytics judgeAnalytics;
//
//    private JudgeAnalytics() {
//
//    }
//
//    public static synchronized JudgeAnalytics getInstance() {
//        if (judgeAnalytics == null) {
//            judgeAnalytics = new JudgeAnalytics();
//        }
//        return judgeAnalytics;
//    }
//}

//double check
//class JudgeAnalytics {
//
//    private static volatile JudgeAnalytics judgeAnalytics;
//
//    private JudgeAnalytics() {
//
//    }
//
//    public static JudgeAnalytics getInstance() {
//        if (judgeAnalytics == null) {
//            synchronized (JudgeAnalytics.class) {
//                if (judgeAnalytics == null) {
//                    judgeAnalytics = new JudgeAnalytics();
//                }
//            }
//        }
//        return judgeAnalytics;
//    }
//}

//Bill pugh singleton
class JudgeAnalytics {

    private JudgeAnalytics() {

    }

    private static class Holder {
        private static final JudgeAnalytics judgeAnalytics = new JudgeAnalytics();
    }

    public static JudgeAnalytics getInstance() {
        return Holder.judgeAnalytics;
    }
}

public class SingletonPatternTUF {

    public static void main(String[] args) {
        JudgeAnalytics judgeAnalytics = JudgeAnalytics.getInstance();
        JudgeAnalytics judgeAnalytics1 = JudgeAnalytics.getInstance();

        System.out.println(judgeAnalytics);
        System.out.println(judgeAnalytics1);
    }
}
