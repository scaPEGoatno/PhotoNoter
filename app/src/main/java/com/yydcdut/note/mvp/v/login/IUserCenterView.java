package com.yydcdut.note.mvp.v.login;

/**
 * Created by yuyidong on 15/11/16.
 */
public interface IUserCenterView extends ILoginView {

    void showQQInfo(String name, String imagePath);

    void showEvernote(boolean login);

}
