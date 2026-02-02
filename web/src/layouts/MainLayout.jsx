import {Outlet} from "react-router-dom";
import Navbar from "../components/Navbar";
import Footer from "../components/Footer";

function MainLayout() {
    return (
        <div className={`flex flex-col min-h-screen bg-[#403D39] justify-between items-center gap-10`}>
            <Navbar />
            <div className={`container mt-10`}>
                <Outlet />
            </div>
            <Footer />
        </div>
    );
}

export default MainLayout;