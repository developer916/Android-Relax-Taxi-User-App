package com.tranxit.enterprise.ui.fragment.cancel_ride;

import com.tranxit.enterprise.base.MvpView;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface CancelRideIView extends MvpView{
    void onSuccess(Object object);
    void onError(Throwable e);
}
