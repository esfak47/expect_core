package com.expect.core;

import org.junit.Test;

/**
 * Project  : expect_core
 * Package  : com.expect.core
 * Author   : tony wang < esfak47@qq.com >
 * Created  : 2014-09-01
 * License  : Apache License 2.0
 */
public class ExpectTest  {
    @Test
    public void testSpawn() {
        Expect expect = Expect.spawn("cmd");
        expect.expect(">");
        System.out.println("expect.before is "+expect.before);
        System.out.println("expect.match is "+expect.match);

        expect.send("ls\n");
        expect.expect(">");
        System.out.println("expect.before is "+expect.before);
        System.out.println("expect.match is "+expect.match);
        expect.send("exit\n");
        expect.expectEOF();
        System.out.println("expect.before is "+expect.before);
        expect.close();
    }
}
