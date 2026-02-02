import HeroSection from "../components/HeroSection";
import FeaturesSection from "../components/FeaturesSection";
import RecommendSection from "../components/RecommendSection";

function Home() {
    return (
        <div className={`flex flex-col items-center justify-center w-full text-[#FFFCF2] gap-10`}>
            <HeroSection />
            <FeaturesSection />
            <RecommendSection />
        </div>
    );
}

export default Home;