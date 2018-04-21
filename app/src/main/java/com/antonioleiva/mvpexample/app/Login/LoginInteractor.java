/*
 *
 *  * Copyright (C) 2014 Antonio Leiva Gordillo.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.antonioleiva.mvpexample.app.Login;


/**
 * model层描述
 *
 * 提供!!我们想要展示在view层的数据 和 具体登陆业务逻辑处理的实现，
 */
public interface LoginInteractor {

    //登陆事件监听
    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);

}

/**
 * Interactor的作用实际上就是获取Model(从本地数据库，或者是服务器),转换成ViewModel，回调通知把ViewModel传递给Presenter。
 *
 * 一个Model也就是我们平常说的JavaBean，例如一个User类，它有自己的基本属性。姓名，年龄，用户名，密码等等。
 *
 * 而ViewModel代表的是视图的Model，例如一个登陆视图，它的ViewModel包含用户名，密码。
 *
 * 所以Model是不能直接被视图使用的，我们需要转换成ViewModel的形式，然后绑定到视图上
 *
 */